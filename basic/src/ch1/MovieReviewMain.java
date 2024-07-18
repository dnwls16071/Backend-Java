package ch1;

public class MovieReviewMain {
	public static void main(String[] args) {
		MovieReview movieReview1 = new MovieReview();
		MovieReview movieReview2 = new MovieReview();

		movieReview1.title = "인셉션";
		movieReview1.review = "인생은 무한 루프";

		movieReview2.title = "어바웃 타임";
		movieReview2.review = "인생 시간 영화!";

		System.out.println("영화 제목 : " + movieReview1.title + ", 리뷰 : " + movieReview1.review);
		System.out.println("영화 제목 : " + movieReview2.title + ", 리뷰 : " + movieReview2.review);
	}
}
