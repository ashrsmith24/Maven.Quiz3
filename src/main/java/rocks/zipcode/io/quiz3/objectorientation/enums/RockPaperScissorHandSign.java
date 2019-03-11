package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ADD_ENUMERATIONS_HERE, PAPER, SCISSOR, ROCK;
    protected static final String rock = "rock";
    protected static final String paper = "paper";
    protected static final String scissor= "scissor";

    public RockPaperScissorHandSign getWinner() {
    String handSign ="";
    if (PAPER.equals(handSign)) {
            return SCISSOR;
        } else if(SCISSOR.equals(handSign)) {
            return ROCK;
        } else {
            return PAPER;
        }
    }

    public RockPaperScissorHandSign getLoser() {
       String handSign ="";
        if (PAPER.equals(handSign)) {
            return ROCK;
        } else if(SCISSOR.equals(handSign)) {
            return PAPER;
        } else {
            return SCISSOR;
        }
    }
}
