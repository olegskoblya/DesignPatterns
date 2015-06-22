package designpatternstest;

import com.company.command.garage.GarageDoor;
import com.company.command.garage.GarageDoorUpCommand;
import com.company.command.light.ConcreteLight;
import com.company.command.light.LightOnCommand;
import com.company.command.SimpleRemoteControl;
import org.junit.*;

/**
 * Created by oleg on 19.06.15.
 */
public class CommandTest extends Assert{


    @Test
    public void testSimpleRemoteControl() {
        ConcreteLight light = new ConcreteLight();
        LightOnCommand command = new LightOnCommand(light);
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setSlot(command);
        remote.buttonWasPressed();


        GarageDoorUpCommand upCommand = new GarageDoorUpCommand(new GarageDoor());
        remote.setSlot(upCommand);
        remote.buttonWasPressed();
    }

}
