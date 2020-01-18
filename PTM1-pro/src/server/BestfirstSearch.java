package server;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class BestfirstSearch<T> extends CommonSearcher<T> {

	public BestfirstSearch() {
	}

	@Override
	public List<State<T>> Search(Searchable<T> se) {
		open = new PriorityQueue<State<T>>();
		close = new ArrayList<State<T>>();

		List<State<T>> succeccors = null;
		State<T> node = null;

		this.open.add(se.getInitialState());
		while (!open.isEmpty()) {
			node = this.pollFromOpen();
			close.add(node);
			
			if (se.isGoalState(node))
				return node.backTrace();
			
			succeccors = se.getAllPossibleStates(node);

			for (State<T> succesor : succeccors) {
				if (!close.contains(succesor) && !open.contains(succesor)) {
					succesor.setCameFrom(node);
					open.add(succesor);
				} else if (open.contains(succesor)) {
					if (succesor.getCost() < node.getCost()) {
						State<T> tmp = node;
						open.remove(node);
						tmp.setCost(succesor.getCost());
						open.add(tmp);
					}

					else
						open.add(node);
				}
			}
		}
		return null;
	}

	@Override
	public int getNumberOfNodesEvaluated() {
		// TODO Auto-generated method stub
		return 0;
	}

}
