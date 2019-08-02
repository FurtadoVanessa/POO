package Model;
public class Cache {
	
	private int palavraTamanho;
	private int offsetTamanho;
    private int linhaTamanho;
    private int tagTamanho;
    
    //tag = qual vez que foi inserida
    //linha = qual linha da ram que ta ali
    //bloco = qual bloco da linha. No mapeamento direto pode desconsiderar
    //load = busca na cache, se não tem, dá miss e pega da ram
    //store = guarda na cache e na ram
    //2way e 4way tem bloco - 2way bloco eh 1, 4way, bloco eh 2
    //chave - vai ser a cache, linha
    //valor - o que ta na ram ou os 32 bits 1
   public Cache(int cache, int ram, int bloco) {
	   this.palavraTamanho = calcula(ram);
	   this.tagTamanho = calcula(bloco);
	   this.offsetTamanho = calcula(cache/bloco);
	   this.linhaTamanho = this.palavraTamanho-this.tagTamanho-this.offsetTamanho;
   }
   
   private int calcula(int valor){
	   int i, tamanho =0;
	   for(i=1; i<valor; i++) {
		   tamanho*=Math.pow(2, i);
		   if(tamanho==valor) {
			   return i;
		   }
	   }
	   return i;
   }

}
