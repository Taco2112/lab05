import java.awt.*;
import java.applet.*;

public class lab05 extends Applet
{
public void paint(Graphics g) {


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


  }
}
