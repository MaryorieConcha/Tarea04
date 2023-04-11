import Model.Cliente;
import Model.CuentaBancaria;
import Model.SucursalBancaria;
import java.util.List;

public class GestionBanco {
	private List<Cliente> clientes;

	private List<SucursalBancaria> sucursalesBancarias;

	public GestionBanco(List<Cliente> clientes, List<SucursalBancaria> sucursalesBancarias) {
		this.clientes = clientes;
		this.sucursalesBancarias = sucursalesBancarias;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public List<SucursalBancaria> getSucursalesBancarias() {
		return sucursalesBancarias;
	}

	public Cliente agregarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		return cliente;
	}

	public SucursalBancaria agregarSucursalBancarias(SucursalBancaria sucursalBancaria) {
		this.sucursalesBancarias.add(sucursalBancaria);
		return sucursalBancaria;
	}

	public SucursalBancaria agregarCuentasBancarias(Cliente cliente){
		this.sucursalesBancarias.get
	}

	public CuentaBancaria mostrarCuentasBancarias(){}

	public SucursalBancaria obtenerCuentasDeAhorro(){}
	public SucursalBancaria obtenerCuentasCorrientes(){}
}