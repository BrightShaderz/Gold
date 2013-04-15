package evolve.gold.server.nbt;

public enum TagType {
	End(0, "End"),
	Byte(1, "Byte"),
	Short(2, "Short"),
	Int(3, "Int"),
	Long(4, "Long"),
	Float(5, "Float"),
	Double(6, "Double"),
	ByteArray(7, "ByteArray"),
	String(8, "String"),
	List(9, "List"),
	Compound(10, "Compound"),
	IntArray(11, "IntArray");
	
	private Integer id;
	private String name;
	
	TagType(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	public static TagType getTypeFromID(int id) throws TagNotFoundException {
		for(TagType type : values()){
	        if(type.id.equals(id)){
	            return type;
	        }
	    }
		throw new TagNotFoundException("There is no TagType with the ID: " + id + ".");
	}
}
