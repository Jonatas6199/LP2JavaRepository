/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversação;

/**
 *
 * @author 081170035
 */
public class CristianoRonaldo extends Pessoa {
    private int id;
    private String name;

    public CristianoRonaldo(String name, int id) {
        super(name, id);
    }
    
    @Override
    public void setId(int id) {
        this.id=id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void Emotion(String emotion) {
        System.out.printf("Sou lindo e me sinto " + emotion + "\n");
    }

    @Override
    public void Salute(Pessoa p) {
        System.out.printf("Olá " + p.getName()+" sou lindo\n" );
    }

    @Override
    public void Presentation() {
        System.out.printf("Sou lindo e melhor que o messi\n");
    }
   
    
    
}
