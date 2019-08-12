package conversação;

public class Pessoa {
    
    private int Id;
    private String name;
    
    public Pessoa(String name, int id){
        setName(name);
        setId(id);       
    }

    public  void setId(int id){
        this.Id = id;
    }
    public  void setName(String name){
        this.name = name;
    }
    public  int getId(){
        return Id;
    }
    public String getName(){
        return name;
    }
    public void Emotion(String emotion){
        System.out.printf("Estou me sentindo "+ emotion +"\n");
    }
    public  void Salute(Pessoa p){
        System.out.printf("Olá " + p.getName()+"\n");
    }
    public  void Presentation(){
        System.out.printf("Olá, me chamo "+ getName()+"\n");
    }
}