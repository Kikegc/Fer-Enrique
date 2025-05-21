package mx.poo.itao.objetos;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Reggaeton extends GeneroMusical {

    public void llamarReggaeton() {
        setNombre("Reggaetón");
        setAmbiente("Fiesta / Calle");
        setRitmo("Rápido");
        setEnergia("Alta");
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
