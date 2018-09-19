package test2;

public class Card {
	public Integer id;
	public Integer type;
	
	public Card(Integer id,Integer type){
		this.id=id;
		this.type=type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Card [id=" + id + ", type=" + type + "]";
	}
	
	
}
