package io.javabrains.ipldashboard.Data;
import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import io.javabrains.ipldashboard.Model.Match;

public class MatchDataProcessor implements ItemProcessor<MatchInput, Match> {

  private static final Logger log = LoggerFactory.getLogger(MatchDataProcessor.class);

  @Override
  public Match process(final MatchInput matchInput) throws Exception {
    Match match=new Match();
    System.out.println("match test1 variable :"+matchInput);
    match.setId(Long.parseLong(matchInput.getId()));
    match.setCity(matchInput.getCity());
    match.setDate(LocalDate.parse(matchInput.getDate()));
    match.setPlayerOfMatch(matchInput.getPlayer_of_match());
    System.out.println("test variable :"+matchInput.getVenue());
    match.setVenue(matchInput.getVenue());
    String firstInnningteam, secondInningTeam;
    if(matchInput.getToss_decision().equals("bat")){
      firstInnningteam=matchInput.getToss_winner();
      secondInningTeam=matchInput.getToss_winner().equals(matchInput.getTeam1())
                    ? matchInput.getTeam2():matchInput.getTeam1();
    }
    else
    {
      secondInningTeam=matchInput.getToss_winner();
      firstInnningteam=matchInput.getToss_winner().equals(matchInput.getTeam1())
      ? matchInput.getTeam2():matchInput.getTeam1();
    }
    match.setTeam1(firstInnningteam);
    match.setTeam2(secondInningTeam);
    match.setTossWinner(matchInput.getToss_winner());
    match.setTossDecision(matchInput.getToss_decision());
    //match.setWinner(matchInput.getWinner());
    match.setResult(matchInput.getResult());
    match.setResultMargin(matchInput.getResult_margin());
    match.setUmpire1(matchInput.getUmpire1());
    match.setUmpire2(matchInput.getUmpire2());


    return match;
  }

}   
