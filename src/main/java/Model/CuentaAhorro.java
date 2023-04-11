package Model;

public class CuentaAhorro extends CuentaBancaria {
	private double reajusteAnual;

	public String getTipo() {
		return "Cuenta de Ahorro";
	}

	public void visualizarCuenta() {
		throw new UnsupportedOperationException();
	}

	public CuentaAhorro(String numeroCuenta, Cliente cliente, SucursalBancaria sucursalBancaria, double reajusteAnual) {
		super(numeroCuenta, cliente, sucursalBancaria);
		this.reajusteAnual = reajusteAnual;
	}
}