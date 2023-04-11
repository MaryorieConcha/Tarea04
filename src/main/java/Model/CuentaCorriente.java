package Model;

public class CuentaCorriente extends CuentaBancaria {
	private int lineaSobregiro;

	public String getTipo() {
		return "Cuenta Corriente";
	}

	public void visualizarCuenta() {
	}

	public CuentaCorriente(String numeroCuenta, int lineaSobregiro, Cliente cliente, SucursalBancaria sucursalBancaria) {
		super(numeroCuenta,cliente,sucursalBancaria);
		this.lineaSobregiro = lineaSobregiro;
	}
}