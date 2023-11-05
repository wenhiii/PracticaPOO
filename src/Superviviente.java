import java.util.ArrayList;
import java.util.Scanner;
public class Superviviente extends Activables {
    private String nombre;
    private final int ACCIONESMAX=3;
    private int accionesRestantes;
    private ArrayList<Equipo> inventario;
    private ArrayList<Equipo> armasActivas;
    private int zombiesEliminados;
    private int heridas;
    //Constructores
    public Superviviente(){
        estaVivo=true;
        posicionX=posicionY=1;
        Scanner leerNombre=new Scanner(System.in);
        System.out.println("Nombre para el superviviente");
        this.nombre=leerNombre.next();
        inventario=new ArrayList<Equipo>(5);
        armasActivas=new ArrayList<>(2);
        this.zombiesEliminados=0;
        this.heridas=0;
    }
    //Metodos get y set
    //Aqui se implementara metodos de todo, sin que sea necesario

    public String getNombre() {
        return this.nombre;
    }
    public int getAccionesRestantes() {
        return this.accionesRestantes;
    }
    public ArrayList<Equipo> getInventario() {
        return this.inventario;
    }
    public ArrayList<Equipo> getArmasActivas() {
        return this.armasActivas;
    }
    public int getZombiesEliminados() {
        return this.zombiesEliminados;
    }
    public int getHeridas() {
        return this.heridas;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setAccionesRestantes(int accionesRestantes) {
        this.accionesRestantes = accionesRestantes;
    }
    public void setInventario(ArrayList<Equipo> inventario) {
        this.inventario = inventario;
    }
    public void setArmasActivas(ArrayList<Equipo> armasActivas) {
        this.armasActivas = armasActivas;
    }
    public void setZombiesEliminados(int zombiesEliminados) {
        this.zombiesEliminados = zombiesEliminados;
    }
    public void setHeridas(int heridas) {
        this.heridas = heridas;
    }

    //Metodos
    public void noHacerNada(){
        if (this.accionesRestantes>0){
            this.accionesRestantes=this.accionesRestantes-1;
        }else{
            System.out.println("Ya no le quedan mas accionesssssssssssssss");
        }
    }
    public void mostrarStatsSuperviviente(){
        System.out.println(getNombre());
        System.out.println(getAccionesRestantes());
        if (getInventario().isEmpty()){
            System.out.println("No tiene objetos el pobre");
        }else{
            ArrayList<Equipo> equipoJugador=getInventario();
            for (int i=1; i<=equipoJugador.size(); i++){
                System.out.print(equipoJugador.get(i).getNombre()+", ");
            }
        }
        if (getArmasActivas().isEmpty()){
            System.out.println("No tiene armas activas el pobre");
        }else{
            ArrayList<Equipo> armasActivasJugador=getArmasActivas();
            for (int i=1; i<=armasActivasJugador.size(); i++){
                System.out.println(armasActivasJugador.get(i).getNombre());
            }
        }
        System.out.println(getZombiesEliminados());
        System.out.println(getHeridas());
    }
    @Override
    public void mover(int numeroZombie){
        if (tieneAccionesRestantes(accionesRestantes)){
            switch (numeroZombie){
                case 0:
                    break;
                case 1:
                    accionesRestantes-=1;
                    if(tieneAccionesRestantes(accionesRestantes)){
                        //Moverse
                    }
                case 2:
                    accionesRestantes-=2;
                    break;
                case 3:
                    accionesRestantes-=3;
                    break;
                case 4:
                    System.out.println("No se puede mover porque tiene 4 zombies");
                    break;
            }
        }else{
            System.out.println("No tiene acciones o no se puede mover");
        }

    }
    public boolean tieneAccionesRestantes(int x){
        return x <= 0;
    }

}