package br.ufpb.git;

public class SomaDeValorPositiva {

	private int x,y,soma;
	
	public SomaDeValorPositiva(){
		this.x = -1;
		this.y = -1;
		this.soma = -1;
	}
	public void setValorX(int x){
		this.x = x;
	}
	public int getValorX(){
		return this.x;
	}
	public void setValorY(int y){
		this.y = y;
	}
	public int getValorY(){
		return this.y;
	}
	public boolean isPositivoX(){
		if(this.x >= 0){
			return true;
		}
		return false;
	}
	public boolean isPositivoY(){
		if(this.y >= 0){
			return true;
		}
		return false;
	}
	public void somaValor(){
		this.soma = this.x + this.y;
	}
	public int getSoma(){
		return this.soma;
	}
}
