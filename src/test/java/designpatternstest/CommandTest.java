package designpatternstest;

import com.company.command.cellingfan.CeilingFan;
import com.company.command.cellingfan.CeilingFanOffCommand;
import com.company.command.cellingfan.CeilingFanOnCommand;
import com.company.command.garage.GarageDoorDownCommand;
import com.company.command.light.Light;
import com.company.command.garage.GarageDoor;
import com.company.command.garage.GarageDoorUpCommand;
import com.company.command.light.LightOffCommand;
import com.company.command.light.LightOnCommand;
import com.company.command.SimpleRemoteControl;
import com.company.command.remote.RemoteControl;
import com.company.command.stereo.Stereo;
import com.company.command.stereo.StereoOffCommand;
import com.company.command.stereo.StereoOnWithCDCommand;
import org.junit.*;

/**
 * Created by oleg on 19.06.15.
 */
public class CommandTest extends Assert{


    @Test
    public void testSimpleRemoteControl() {
        Light light = new Light("Zippo!");
        LightOnCommand command = new LightOnCommand(light);
        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setSlot(command);
        remote.buttonWasPressed();


        GarageDoorUpCommand upCommand = new GarageDoorUpCommand(new GarageDoor());
        remote.setSlot(upCommand);
        remote.buttonWasPressed();
    }

    @Test
    public void testMoreComplexRemoteControl() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand  ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);


    }

}
