package ch1;

public class MovieReviewMain2 {
	public static void main(String[] args) {
		MovieReview movieReview1 = new MovieReview();
		MovieReview movieReview2 = new MovieReview();

		movieReview1.title = "인셉션";
		movieReview1.review = "인생은 무한 루프";

		movieReview2.title = "어바웃 타임";
		movieReview2.review = "인생 시간 영화!";

		MovieReview[] movieReviews = {movieReview1, movieReview2};

		for (int i = 0; i < movieReviews.length; i++) {
			System.out.println("영화 제목 : " + movieReviews[i].title + ", 리뷰 : " + movieReview1.review);
		}
	}
}
