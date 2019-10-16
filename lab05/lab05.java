import java.awt.*;
import java.applet.*;

public class lab05 extends Applet
{
public void paint(Graphics g) {
/**
int a = 0;
int b = 630;

//int c = 980;
//int d = 620;
//g.drawLine( a, b, c, d);

//while ( a < 980 ) {
//  a+= 2;

//}

// Question : the code runs top to bottom -> int a  will equal 0 in the begining . now when it hits the loop
// dose it update and draw said line agian
// Question can i put multiple conditional things in one loop statment.

int c = 980;
int d = 0;

for(int J = 1; J > 980; J++){
g.drawLine( a, b, c, d);
a+= 10;
d+=10;
  }

**/


int x, y, t, i;
    x=0;
    y=0;
    t=630;
    for (i=0; i<=t; i+=10)
      g.drawLine(x, y+i, x+i, y+t);



      int a, b, el, l;
          a=980;
          b=0;
          el=630;
          for (l=0; l<=el; l+=10)
            g.drawLine(a, b+l, a-l, b+el);

//everthing above works -- below works ,it is for the flipped lines . Each int set is read from left to right on the screen

int p, r, w, u;
    p=0;
    r=630;
    w=630;
    for (u=0; u<=w; u+=10)
      g.drawLine(p, r-u, p+u, r-w);



  int d, h, q, m;
          d=980;
          h=630;
          q=630;
          for (m=0; m<=t; m+=10)
            g.drawLine(d, h-m, d-m, h-q);


            // below is trying 110


            int j, o, k, e;
                j=220;
                o=210;
                k=315;
                for (e=0; e<=k; e+=10)
                  g.drawLine(j, o+e, j+e, o+k);

                  int s, oo, kk, ee;
                      s=760;
                      oo=210;
                      kk=315;
                      for (ee=0; ee<=kk; ee+=10)
                        g.drawLine(s, oo+ee, s-ee, oo+kk);
                                                                    //wow almost there

                        int the, force, is, strong;
                            the=220;
                            force=420;
                            is=315;
                            for (strong=0; strong<=is; strong+=10)
                              g.drawLine(the, force-strong, the+strong, force-is);

                              int neato, speghito, kool, aid;
                                  neato=760;
                                  speghito=420;
                                  kool=315;
                                  for (aid=0; aid<=kool; aid+=10)
                                    g.drawLine(neato, speghito-aid, neato-aid, speghito-kool);
//Thee end

/**  g.drawRect(300, 400, 100, 100);
  g.drawRect(330, 430, 100, 100);
  g.drawLine(300, 400, 330, 430);
  g.drawLine(400, 400, 430, 430);
  g.drawLine(330, 530, 300, 500);
  g.drawLine(430, 530, 400, 500);

  // DRAW SPHERE

  g.drawOval(600, 400, 200, 200);
  g.drawOval(600, 430, 200, 150);
  g.drawOval(600, 450, 200, 110);
  g.drawOval(600, 480, 200, 50);
  g.drawOval(650, 400, 100, 200);
  g.drawOval(675, 400, 50, 200);
  g.drawOval(690, 400, 15, 200);

  // DRAW INSCRIBED/CIRCUMSIZED TRIANGLE

  g.drawOval(700, 200, 200, 200);
  g.drawOval(730, 270, 110, 85);
  g.drawLine(700, 300, 800, 400);
  g.drawLine(700, 300, 885, 240);
  g.drawLine(800, 400, 885, 240);

  // DRAW APCS
  g.fillRect(300, 600, 35, 140);
  g.fillRect(300, 600, 100, 35);
  g.fillRect(400, 600, 35, 140);
  g.fillRect(300, 670, 100, 35);

  g.fillRect(450, 600, 35, 140);
  g.fillRect(450, 600, 100, 35);
  g.fillRect(550, 600, 35, 80);
  g.fillRect(450, 670, 135, 35);

  g.fillRect(600, 600, 35, 140);
  g.fillRect(600, 600, 100, 35);
  g.fillRect(600, 700, 100, 40);

  g.fillRect(710, 600, 35, 70);
  g.fillRect(710, 600, 80, 35);
  g.fillRect(710, 670, 80, 35);
  g.fillRect(770, 670, 25, 60);
  g.fillRect(770, 700, 25, 35);
  g.fillRect(710, 720, 85, 30);
**/
  }
}
