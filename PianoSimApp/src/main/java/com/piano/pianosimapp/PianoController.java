package com.piano.pianosimapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;



import javafx.scene.input.KeyCode;

public class PianoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button C;

    @FXML
    private Button D;

    @FXML
    private Button E;

    @FXML
    private Button F;

    @FXML
    private Button G;

    @FXML
    private Button A;

    @FXML
    private Button B;

    @FXML
    private Label octave;

    @FXML
    private Button CBlack;

    @FXML
    private Button DBlack;

    @FXML
    private Button FBlack;

    @FXML
    private Button GBlack;

    @FXML
    private Button ABlack;

    @FXML
    private Button Plus;

    @FXML
    private Button Minus;


    @FXML
    void clickA(ActionEvent event) {
        PlayChanel(notes.get(9));
        pressedKeys.remove("A");
    }

    @FXML
    void clickABlack(ActionEvent event) {
        PlayChanel(notes.get(10));
        pressedKeys.remove("A#");
    }

    @FXML
    void clickB(ActionEvent event) {
        PlayChanel(notes.get(11));
        pressedKeys.remove("B");
    }

    @FXML
    protected void clickC() {
        PlayChanel(notes.get(0));
        pressedKeys.remove("C");
    }

    @FXML
    void clickCBlack(ActionEvent event) {
        PlayChanel(notes.get(1));
        pressedKeys.remove("C#");
    }

    @FXML
    void clickD(ActionEvent event) {
        PlayChanel(notes.get(2));
        pressedKeys.remove("D");
    }

    @FXML
    void clickDBlack(ActionEvent event) {
        PlayChanel(notes.get(3));
        pressedKeys.remove("D#");
    }

    @FXML
    void clickE(ActionEvent event) {
        PlayChanel(notes.get(4));
        pressedKeys.remove("E");
    }

    @FXML
    void clickF(ActionEvent event) {
        PlayChanel(notes.get(5));
        pressedKeys.remove("F");
    }

    @FXML
    void clickFBlack(ActionEvent event) {
        PlayChanel(notes.get(6));
        pressedKeys.remove("F#");
    }

    @FXML
    void clickG(ActionEvent event) {
        PlayChanel(notes.get(7));
        pressedKeys.remove("G");
    }

    @FXML
    void clickGBlack(ActionEvent event) {
        PlayChanel(notes.get(8));
        pressedKeys.remove("G#");
    }


    @FXML
    void clickMinus(ActionEvent event) {
        if(octaveValue != -5) {
            octaveValue = octaveValue -1;
            octave.setText("Octave "+ octaveValue);
            for (int i = 0;i < notes.size();i++){
                Integer notePitch = (notes.get(i).number) -12;
                PianoKey changedNote = notes.get(i);
                changedNote.setNumber(notePitch);
                notes.set(i,changedNote);
            }
        }
        else octave.setText("Octave on minimum");
    }

    @FXML
    void clickPlus(ActionEvent event) {
        if(octaveValue != 5){
            octaveValue = octaveValue +1;
            octave.setText("Octave "+ octaveValue);
            for (int i = 0;i < notes.size();i++){
                Integer notePitch = (notes.get(i).number) +12;
                PianoKey changedNote = notes.get(i);
                changedNote.setNumber(notePitch);
                notes.set(i,changedNote);
            }

        }
        else octave.setText("Octave on maximum");
    }

    public Integer octaveValue = 0;

    public List<PianoKey> notes = Arrays.asList(
            new PianoKey("C", KeyCode.A, 60),
            new PianoKey("C#", KeyCode.W, 61),
            new PianoKey("D", KeyCode.S, 62),
            new PianoKey("D#", KeyCode.E, 63),
            new PianoKey("E", KeyCode.D, 64),
            new PianoKey("F", KeyCode.F, 65),
            new PianoKey("F#", KeyCode.T, 66),
            new PianoKey("G", KeyCode.G, 67),
            new PianoKey("G#", KeyCode.Y, 68),
            new PianoKey("A", KeyCode.H, 69),
            new PianoKey("A#", KeyCode.U, 60),
            new PianoKey("B", KeyCode.J, 71)

    );

    final Set<String> pressedKeys = new HashSet<String>();

    public void PlayChanel(PianoKey Note) {
        if (!pressedKeys.contains(Note.getName())) {
            if(CheckLoadSound = true){
            pressedKeys.add(Note.getName());

            channel.noteOn(Note.number, 90);}
        } else {
            if (CheckLoadSound = false) System.out.println("Sound not load. Press Load Sound");
        }
    }

    private MidiChannel channel;
    public Boolean CheckLoadSound = false;

    private void loadChanel() {
        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            synth.loadInstrument(synth.getDefaultSoundbank().getInstruments()[0]);
            channel = synth.getChannels()[0];
            CheckLoadSound = true;
        } catch (MidiUnavailableException e) {
            System.out.println("Cannot get Synthesizer");
            e.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        loadChanel();
    }
}
