package ch5;

public enum HttpStatus {
	OK(200, "OK"),
	BAD_REQUEST(400, "Bad Request"),
	NOT_FOUND(404, "Not Found"),
	INTERNAL_SERVER_ERROR(500, "Interval Server Error");

	private final int code;
	private final String message;

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	// 입력한 HTTP 코드를 토대로 상태 코드 찾기
	public static HttpStatus findByCode(int code) {
		HttpStatus[] values = HttpStatus.values();
		for (HttpStatus value : values) {
			if (value.getCode() == code) {
				return value;
			}
		}
		return null;
	}

	// 성공 여부
	public boolean isSuccess() {
		return 200 <= code && code <= 299;
	}

	HttpStatus(int code, String message) {
		this.code = code;
		this.message = message;
	}
}
