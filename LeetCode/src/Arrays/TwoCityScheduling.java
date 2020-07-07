package Arrays;

import java.util.Arrays;

public class TwoCityScheduling {

	public int twoCitySchedCost(int[][] costs) {
		Arrays.sort(costs, (p1, p2) -> (p1[0] - p2[0]) - (p1[1] - p2[1]));
		int mincost = 0;
		for (int i = 0; i < costs.length / 2; i++) {
			mincost += costs[i][0];
			mincost += costs[costs.length / 2 + i][1];
		}
		return mincost;
	}
}


/*
 *Problem Statement ::
 *There are 2N people a company is planning to interview. The cost of flying the i-th person to city A is costs[i][0], and the cost of flying the i-th person to city B is costs[i][1].

Return the minimum cost to fly every person to a city such that exactly N people arrive in each city.

Solution Explanation ::
we have find the profit array :: that is subtracting the values from location b to a and find which is more profitable , 
and once we find that and sort it accordingly , we can take first half of this this sorted array for city a, and other 
half for city b .

Note :: sorting logic written here was copied from google , I am not very confident with 2d sorting using functional programming 


 * 
 * */
 