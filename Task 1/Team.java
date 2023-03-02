class Team{
	private String teamName;
	private int teamRank;


	public Team(String tName){
		this.teamName = tName;
	}
	public void setRank (int i){
		this.teamRank = i;
	}

	@Override
	public String toString(){
		
		String s = "Hold: " + teamName + " - Rang: " + teamRank;

		return s;

	} 

}