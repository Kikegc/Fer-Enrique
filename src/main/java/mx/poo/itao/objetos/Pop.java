package mx.poo.itao.objetos;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Pop extends GeneroMusical {

    public void llamarPop() {
        setNombre("Pop");
        setAmbiente("Radio / General");
        setRitmo("Medio");
        setEnergia("Media");
        setPopularidad("Muy Alta");
    }

    public void mostrarInfo() {
        System.out.println("🎤 Género: " + getNombre());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Ritmo: " + getRitmo());
        System.out.println("Energía: " + getEnergia());
        System.out.println("Popularidad: " + getPopularidad());
    }
}
