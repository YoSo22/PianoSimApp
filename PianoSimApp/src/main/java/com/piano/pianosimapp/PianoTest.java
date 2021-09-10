package com.piano.pianosimapp;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import org.junit.jupiter.api.Test;

import org.testfx.api.FxAssert;

import org.testfx.framework.junit5.ApplicationTest;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

import java.io.IOException;


public class PianoTest extends ApplicationTest{
    Pane mainroot;
    Stage mainstage;
    private Object controller;

    @Start
    public void start(Stage stage) throws IOException {
        this.mainstage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Piano View.fxml"));
        this.mainroot = fxmlLoader.load();
        this.controller = fxmlLoader.getController();
        stage.setScene(new Scene(mainroot));
        stage.show();
        stage.toFront();
    }


    @Test
    public void ShouldContainButtonWithText() {
        FxAssert.verifyThat("#Plus", LabeledMatchers.hasText("+"));
        FxAssert.verifyThat("#Minus", LabeledMatchers.hasText("-"));
        FxAssert.verifyThat("#C", LabeledMatchers.hasText("C"));
        FxAssert.verifyThat("#CBlack", LabeledMatchers.hasText("C#"));
        FxAssert.verifyThat("#D", LabeledMatchers.hasText("D"));
        FxAssert.verifyThat("#DBlack", LabeledMatchers.hasText("D#"));
        FxAssert.verifyThat("#E", LabeledMatchers.hasText("E"));
        FxAssert.verifyThat("#F", LabeledMatchers.hasText("F"));
        FxAssert.verifyThat("#FBlack", LabeledMatchers.hasText("F#"));
        FxAssert.verifyThat("#G", LabeledMatchers.hasText("G"));
        FxAssert.verifyThat("#GBlack", LabeledMatchers.hasText("G#"));
        FxAssert.verifyThat("#A", LabeledMatchers.hasText("A"));
        FxAssert.verifyThat("#ABlack", LabeledMatchers.hasText("A#"));
        FxAssert.verifyThat("#B", LabeledMatchers.hasText("B"));
    }

    @Test
    public void octaveIncreaseTest() {
        clickOn("#Plus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave 1"));
        clickOn("#Plus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave 2"));
        clickOn("#Plus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave 3"));
        clickOn("#Plus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave 4"));
        clickOn("#Plus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave 5"));
        clickOn("#Plus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave on maximum"));
    }

    @Test
    public void octaveDecreaseTest() {
        clickOn("#Minus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave -1"));
        clickOn("#Minus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave -2"));
        clickOn("#Minus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave -3"));
        clickOn("#Minus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave -4"));
        clickOn("#Minus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave -5"));
        clickOn("#Minus"); FxAssert.verifyThat("#octave", LabeledMatchers.hasText("Octave on minimum"));
    }

    @Test
    public void ClickOnKeyTestIncreaseTest() {
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Plus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Plus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Plus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Plus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Plus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
    }

    @Test
    public void ClickOnKeyTestDecreaseTest() {
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Minus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Minus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Minus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Minus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
        clickOn("#Minus");
        clickOn("#C");
        clickOn("#CBlack");
        clickOn("#D");
        clickOn("#DBlack");
        clickOn("#E");
        clickOn("#F");
        clickOn("#FBlack");
        clickOn("#G");
        clickOn("#GBlack");
        clickOn("#A");
        clickOn("#ABlack");
        clickOn("#B");
    }
}
