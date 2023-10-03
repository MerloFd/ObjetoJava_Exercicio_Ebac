/**
 * classe do carro
 *
 * @author MerloFd
 */
public class MustangGt {
    /**
     * propriedades do objeto
     */
    private String cor;
    private String motor;
    private String modelo;

    /**
     * métodos getters e setters da variavel cor
     * @return cor;
     */
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * métodos getters e setters da variavel moto
     * @return motor;
     */
    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    /**
     * métodos getters e setters da variavel modelo
     * @return modelo;
     */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * métodos que dão um valor as variaveis
     */
    public void corMustang () {
        setCor("Vermelho");
    }
    public void motorMustang () {
        setMotor("motor V8");
    }
    public void modeloMustang () {
        setModelo("Ford mustang gt");
    }
}
