package mx.poo.itao.objetos;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
public class Electronica extends GeneroMusical {

    public void llamarElectronica() {
        setNombre("Electrónica");
        setAmbiente("Fiesta / Club");
        setRitmo("Rápido");
        setEnergia("Alta");
        setPopularidad("Alta");
    }

    public void mostrarInfo() {
        System.out.println("🎧 Género: " + getNombre());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Ritmo: " + getRitmo());
        System.out.println("Energía: " + getEnergia());
        System.out.println("Popularidad: " + getPopularidad());
    }
}