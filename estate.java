public class estate extends card{
	public estate(){
		name = "estate";
		type = "victory";
		cost = 2;
		gold = 0;
		victory_points = 1;
		action = 0;
		buy = 0;
		card = 0;
		attack = false;
	}

	public void perform_attack(player[] player_array, int turn, board dominion){
		//This is intentionally left blank
	}

	public void description(){
		System.out.println("Estate: A victory card that gives the player 1 victory point at the end of the game");
		System.out.println();
	}

}
