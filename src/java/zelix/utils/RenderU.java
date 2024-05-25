package zelix.utils;

import static org.lwjgl.opengl.GL11.*;

public class RenderU {
    public void drawRect(int x1,int y1,int x2,int y2){
        glEnable(GL_BLEND);
        glDisable(GL_TEXTURE_2D);

        glBegin(GL_POLYGON);

        glVertex2i(x1,y1);
        glVertex2i(x2,y1);
        glVertex2i(x2,y2);
        glVertex2i(x1,y2);

        glEnd();

        glEnable(GL_TEXTURE_2D);
        glDisable(GL_BLEND);
    }
}
