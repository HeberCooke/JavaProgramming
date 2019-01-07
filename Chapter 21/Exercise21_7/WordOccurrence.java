
public class WordOccurrence implements Comparable<WordOccurrence> {
	String word;
	Integer count = 0;

	WordOccurrence(String word, int count) {
		this.word = word;
		this.count = count;
	}

	@Override
	public int compareTo(WordOccurrence o) {
		return o.count.compareTo(count);
	}

	@Override
	public String toString() {
		return word + "   " + count;
	}

}
