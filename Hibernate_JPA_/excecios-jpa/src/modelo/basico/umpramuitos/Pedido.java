package modelo.basico.umpramuitos;

import java.util.Date;

public class Pedido {
	
	private Long id;
	
	private Date data;
	
	
	

	public Pedido() {
		
	}
	
	

	public Pedido(Date data) {
		super();
		this.data = data;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	

}
