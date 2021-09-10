/*package com.piano.pianosimapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.BeforeClass;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobotException;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;

import java.util.concurrent.TimeoutException;

import static javafx.application.Application.launch;
import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;
class GuiTest extends PianoTest  {

    @Test
    void should_click_on_first_button() {
        // when:
        clickOn("#Plus");

        // then:
        verifyThat("#octave", hasText("Octave 1"));
    }



    @Test
    void should_click_on_second_button_twice(FxRobot robot) {
        // when:
        robot.clickOn("#Plus");
        robot.clickOn("#Plus");
        // then:
        verifyThat("#second-button", hasText("Octave 2"));

    }
}
 */
