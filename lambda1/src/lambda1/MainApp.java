package lambda1;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user1 = new Usuario("Julio", 150, true);
		Usuario user2 = new Usuario("Maria", 50, false);
		Usuario user3 = new Usuario("Antônio", 10, false);
		Usuario user4 = new Usuario("João", 10, false);
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
		//método com lambda
		usuarios.forEach(u -> {
			System.out.println(u.getNome() + "moderador? " + u.isModerador());
			u.setModerador(true);
			System.out.println(u.isModerador());
			
		});
		
		//método com classe anônima & classe própria
		//Mostrador mostrador = new Mostrador();
		/*usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});*/
		
		//método tradicional
		/*
		for(Usuario u : usuarios){
			System.out.println(u.getNome());
		}*/
	}
}
