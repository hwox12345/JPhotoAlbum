package fi.iki.jka;

import org.junit.Test;

import java.awt.event.ActionEvent;

import static fi.iki.jka.JPhotoMenu.A_SLIDESHOW;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class JPhotoFrameTest {
    @Test
    public void frameIsVisibleWhenSlideshowCommandIsUsedAndMoreThanOneFilesArePassed() throws Exception {
        String albumName = "/Users/yiannis/Downloads/test.jph";
        String[] files = new String[]{
          "/Users/yiannis/Downloads/strawberries-6014361_640.jpg",
          "/Users/yiannis/Downloads/stork-5828727_640.jpg",
        };
        JPhotoFrame frame = new JPhotoFrame(albumName, files, false);
        frame.actionPerformed(new ActionEvent(this, 0, A_SLIDESHOW));

        assertThat(frame.getMockVisible(), equalTo(true));
    }

    @Test
    public void rotationIntervalIsN() throws Exception {
        String albumName = "/Users/yiannis/Downloads/test.jph";
        String[] files = new String[]{
                "/Users/yiannis/Downloads/strawberries-6014361_640.jpg",
                "/Users/yiannis/Downloads/stork-5828727_640.jpg",
        };
        JPhotoFrame frame = new JPhotoFrame(albumName, files, false);
        frame.setRotationInterval(1000);
        frame.actionPerformed(new ActionEvent(this, 0, A_SLIDESHOW));
    }

//    @Test
//    public void frameIsNotVisibleWhenSlideshowCommandIsUsedAndNoFilesArePassed() throws Exception {
//        String albumName = "/Users/yiannis/Downloads/test.jph";
//        String[] files = new String[]{};
//        JPhotoFrame frame = new JPhotoFrame(albumName, files, false);
////        frame.showErrorMessageFunc =
//        frame.actionPerformed(new ActionEvent(this, 0, A_SLIDESHOW));
//
////        assertThat(frame.isShowVisible(), equalTo(true));
//    }
}