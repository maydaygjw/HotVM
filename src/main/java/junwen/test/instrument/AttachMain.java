package junwen.test.instrument;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

import java.util.List;

/**
 * Created by jg78779 on 5/8/14.
 */
public class AttachMain extends Thread {

    private final List<VirtualMachineDescriptor> listBefore;

    private final String jar;

    AttachMain(String attachJar, List<VirtualMachineDescriptor> vms) {
        listBefore = vms;
        jar = attachJar;
    }

    public void run() {
        VirtualMachine vm = null;
        List<VirtualMachineDescriptor> listAfter = null;
        try {
            int count = 0;
            while (true) {
                listAfter = VirtualMachine.list();
                for (VirtualMachineDescriptor vmd : listAfter) {
                    if (!listBefore.contains(vmd)) {
                        vm = VirtualMachine.attach(vmd);
                        break;
                    }
                }
                Thread.sleep(500);
                count++;
                if (null != vm || count >= 10) {
                    break;
                }
            }
            vm.loadAgent(jar);
            vm.detach();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        new AttachMain("C:\\Users\\jg78779\\git-repo\\HotVM\\target\\HotVM-1.0-SNAPSHOT.jar", VirtualMachine.list()).start();
    }
}
