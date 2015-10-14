package sets;

import java.util.HashSet;
import java.util.Set;

public class ExecSet {

	public static Set<Integer> novoSet(int[] values, int size){
		Set<Integer> s = new HashSet();
		
		for(int i=0; i < size; i++){
			s.add(values[i]);
		}
		
		return s;
	}
	
	public static String pertence(Set<Integer> conj, int val){
		if(conj.contains(val)){
			return "Verdade";
		}
		return "Falso";
	}
	
	public static void main(String[] args){
		System.out.println("Instanciando conj1 como um conjunto de inteiros...");
		System.out.println("Adicionando os elementos 23, 23, 34, 45, 12, 45, 23");
		
		int[] nums = {23, 23, 34, 45, 12, 45, 23};
		Set<Integer> conj1 = novoSet(nums, 6);
		
		System.out.println("Instanciando conj2 como um conjunto de inteiros...");
		System.out.println("Adicionando os elementos 12, 453, 34, 543, 231");
		
		int[] nums2 = {12, 453, 34, 543, 231};
		Set<Integer> conj2 = novoSet(nums2, 5);
		
		System.out.println("Imprimindo conj1: "+conj1);
		System.out.println("O elemento 23 pertence a conj1? "+pertence(conj1, 23));
		
		System.out.println("Removendo o elemento 231 de conj2...");
		conj2.remove(231);
		System.out.println("Imprimindo conj2: "+conj2);
		
		System.out.println("Conj1 está contido em conj2? "+pertence(conj1, 23));

		
	}
}
