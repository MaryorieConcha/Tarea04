package Model;

import java.util.ArrayList;
import Model.CuentaBancaria;

public class SucursalBancaria {
	private String codigoSucursal;
	private String codigoPostal;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public String getCodigoSucursal() {
		return codigoSucursal;
	}

	public ArrayList<CuentaBancaria> getCuentasBancarias() {
		return cuentasBancarias;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public SucursalBancaria(String codigoSucursal, String codigoPostal) {}
}