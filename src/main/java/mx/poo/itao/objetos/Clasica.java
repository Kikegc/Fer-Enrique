package mx.poo.itao.objetos;
import lombok.*;
@Getter
@Setter
 
@NoArgsConstructor
public class Clasica extends GeneroMusical {

    public void llamarClasica() {
        setNombre("Clásica");
        setAmbiente("Formal / Estudio");
        setRitmo("Lento");
        setEnergia("Baja");
        setPopularidad("Media");
    }

    public void mostrarInfo() {
        System.out.println("🎻 Género: " + getNombre());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Ritmo: " + getRitmo());
        System.out.println("Energía: " + getEnergia());
        System.out.println("Popularidad: " + getPopularidad());
    }
}
