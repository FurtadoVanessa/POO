package Model;

public class Palavra {
	
	 	private String tag;
	    private String linha;
	    private String index;
	    
	    
		public Palavra(){


	    }

	    public Palavra(String tag, String linha, String index){
	        this.index = index;
	        this.linha = linha;
	        this.tag = tag;
	    }

	    public String getTag() {
	        return tag;
	    }

	    public void setTag(String tag) {
	        this.tag = tag;
	    }

	    public String getLinha() {
	        return linha;
	    }

	    public void setLinha(String linha) {
	        this.linha = linha;
	    }

	    public String getIndex() {
	        return index;
	    }

	    public void setIndex(String index) {
	        this.index = index;
	    } 

}
