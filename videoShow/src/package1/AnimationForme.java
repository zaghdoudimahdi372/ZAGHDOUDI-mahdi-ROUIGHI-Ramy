/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.awt.Graphics;

/**
 */
public abstract class AnimationForme implements IFormeAnimable {
    
    private Forme forme;
    private IFormeAnimable formeAnimable;

    public AnimationForme(Forme forme, IFormeAnimable formeAnimable) {
        this.forme = forme;
        this.formeAnimable = formeAnimable;
    }

    
    public void deplacer() {
        this.formeAnimable.deplacer(this.forme);
    }

    
    public void dessiner(Graphics g) {
        this.forme.dessiner(g);
    }
    
    
    
}
