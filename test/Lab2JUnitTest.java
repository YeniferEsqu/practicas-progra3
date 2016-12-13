/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.assertj.swing.fixture.JPanelFixture;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import una.lab2.swing.Lab2;

/**
 *
 * @author Estudiante
 */
public class Lab2JUnitTest {
    

    private FrameFixture window;
    private JPanelFixture panel;

    @Before
    public void setUp() {
        Lab2 frame = GuiActionRunner.execute(() -> new Lab2());
        window = new FrameFixture(frame);
        window.show();
        panel = window.panel("Form");
    }

    @Test
    public void testVisibleComponents() {
        panel.label("lblName").requireVisible();
        panel.label("lblPhone").requireVisible();
        panel.label("lblGender").requireVisible();
        panel.label("lblResult").requireVisible();


        panel.button("ok").requireVisible();
        panel.button("clean").requireVisible();
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }
}
