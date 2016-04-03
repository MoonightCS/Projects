import time
import numpy as np


def quadratic(bets, wins):
    bets_indexes = np.argsort(bets)
    bets, wins = bets[bets_indexes], wins[bets_indexes]
    running_sums = [0]
    for i in range(1,len(wins)+1):
        running_sums.append(running_sums[i-1]+wins[i-1])
    desired_bets = []
    sum_win_less, sum_win_more = 0,0
    sum_win = running_sums[-1]
    for i in xrange(len(bets)):
        sum_win_less = running_sums[i]
        sum_win_more =  sum_win - running_sums[i+1]
        if sum_win_less <= sum_win/2 and sum_win_more <= sum_win/2:
            desired_bets.append(bets[i])
    return desired_bets


if __name__ == '__main__':
    bets = np.array([3,5,2,4,8])
    wins = np.array([1,3,2,2,1])
    print quadratic(bets, wins)


