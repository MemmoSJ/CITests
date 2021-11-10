import org.jhotdraw.app.action.PasteAction;
import org.jhotdraw.draw.*;
import org.jhotdraw.samples.svg.figures.SVGPathFigure;
import org.junit.*;

import javax.swing.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class TestMe {

    private DrawingView view;

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {

        view = new DefaultDrawingView();
        view.setDrawing(new DefaultDrawing());
        view.getDrawing().add(new SVGPathFigure(true));

        view.selectAll();

    }

    @After
    public void tearDown() {

    }


    @Test
    public void answer() {

        DefaultDrawingView dview = (DefaultDrawingView) view;

        dview.delete();

        assertTrue(dview.getSelectionCount() == 0);

    }



}
