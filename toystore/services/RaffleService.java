package toystore.services;

import toystore.model.raffle.Raffle;

public interface RaffleService {
    Raffle.Results doRaffle(Raffle raffle);
}
