package server_side;

import java.util.HashMap;

public class FileCacheManager<Problem, Solution> implements CacheManager<Problem, Solution> {

	HashMap<Problem, Solution> hashsol = new HashMap<>();

	public void saveSolution(Problem p, Solution s) {
		hashsol.put(p, s);

	}

	public Solution querySolution(Problem p) {
		if (isexist(p))
			hashsol.get(p);
		return null;
	}

	public Boolean isexist(Problem p) {
		return this.hashsol.containsKey(p);
	}

}
