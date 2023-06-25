package dev.takuiash.api.utils.web.response;

import dev.takuiash.api.utils.web.Status;
import dev.takuiash.api.utils.web.response.ErrorData.ErrorType;
import spark.Response;

public class ResponseBuilder {
		
		private ApiResponse response;
		
		public ResponseBuilder(Response res) {			
			this.response = new ApiResponse(true, Status.OK);
		}
		
		public ResponseBuilder(Object... data) {
			this.response = new ApiResponse(true, Status.OK, data);
		}
		
	     /**
         * 200 OK, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.2.1">HTTP/1.1 documentation</a>.
         */
		public Object ok(Response res) {
			this.response.ok = true;
			this.response.status = Status.OK;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 201 Created, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.2.2">HTTP/1.1
         * documentation</a>.
         */
		public Object created(Response res) {
			this.response.ok = true;
			this.response.status = Status.CREATED;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 202 Accepted, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.2.3">HTTP/1.1
         * documentation</a>.
         */
		public Object accepted(Response res) {
			this.response.ok = true;
			this.response.status = Status.ACCEPTED;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 204 No Content, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.2.5">HTTP/1.1
         * documentation</a>.
         */
		public Object noContent(Response res) {
			this.response.ok = true;
			this.response.status = Status.NO_CONTENT;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 205 Reset Content, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.2.6">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object resetContent(Response res) {
			this.response.ok = true;
			this.response.status = Status.RESET_CONTENT;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 206 Partial Content, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.2.7">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object partialContent(Response res) {
			this.response.ok = true;
			this.response.status = Status.PARTIAL_CONTENT;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 300 Multiple Choices, see <a href="https://datatracker.ietf.org/doc/html/rfc7231#section-6.4.1">HTTP/1.1:
         * Semantics and Content</a>.
         *
         * @since 3.1
         */
		public Object multipleChoices(Response res) {
			this.response.ok = true;
			this.response.status = Status.MULTIPLE_CHOICES;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 301 Moved Permanently, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.3.2">HTTP/1.1
         * documentation</a>.
         */
		public Object movedPermanently(Response res) {
			this.response.ok = true;
			this.response.status = Status.MOVED_PERMANENTLY;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 302 Found, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.3.3">HTTP/1.1 documentation</a>.
         *
         * @since 2.0
         */
		public Object found(Response res) {
			this.response.ok = true;
			this.response.status = Status.FOUND;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
		/**
         * 303 See Other, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.3.4">HTTP/1.1
         * documentation</a>.
         */
		public Object seeOther(Response res) {
			this.response.ok = true;
			this.response.status = Status.SEE_OTHER;
			
			res.status(response.status.getStatusCode());

			return response;
		}

		/**
         * 304 Not Modified, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.3.5">HTTP/1.1
         * documentation</a>.
         */
		public Object notModified(Response res) {
			this.response.ok = true;
			this.response.status = Status.NOT_MODIFIED;
			
			res.status(response.status.getStatusCode());

			return response;
		}  
		
        /**
         * 305 Use Proxy, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.3.6">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object useProxy(Response res) {
			this.response.ok = true;
			this.response.status = Status.USE_PROXY;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
		/**
         * 307 Temporary Redirect, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.3.8">HTTP/1.1
         * documentation</a>.
         */
		public Object temporaryRedirect(Response res) {
			this.response.ok = true;
			this.response.status = Status.TEMPORARY_REDIRECT;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
		/**
         * 308 Permanent Redirect, see <a href="https://tools.ietf.org/html/rfc7538">RFC 7538:
         * The Hypertext Transfer Protocol Status Code 308 (Permanent Redirect)</a>.
         *
         * @since 3.1
         */
		public Object permanentRedirect(Response res) {
			this.response.ok = true;
			this.response.status = Status.PERMANENT_REDIRECT;
			
			res.status(response.status.getStatusCode());

			return response;
		}

		/**
         * 400 Bad Request, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.1">HTTP/1.1
         * documentation</a>.
         */
		public Object badRequest(Response res) {
			this.response.ok = false;
			this.response.status = Status.BAD_REQUEST;
			
			res.status(response.status.getStatusCode());

			return response;
		}

		/**
         * 401 Unauthorized, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.2">HTTP/1.1
         * documentation</a>.
         */
		public Object unauthorized(Response res) {
			this.response.ok = false;
			this.response.status = Status.UNAUTHORIZED;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 402 Payment Required, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.3">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object paymentRequired(Response res) {
			this.response.ok = false;
			this.response.status = Status.PAYMENT_REQUIRED;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 403 Forbidden, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.4">HTTP/1.1
         * documentation</a>.
         */
		public Object forbidden(Response res) {
			this.response.ok = false;
			this.response.status = Status.FORBIDDEN;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 404 Not Found, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.5">HTTP/1.1
         * documentation</a>.
         */
		public Object notFound(Response res) {
			this.response.ok = false;
			this.response.status = Status.NOT_FOUND;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		public Object notFound(Response res, String message) {
			this.response.ok = false;
			this.response.status = Status.NOT_FOUND;
			this.response.putData(new ErrorData(ErrorType.NOT_FOUND, message));
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 405 Method Not Allowed, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.6">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object methodNotAllowed(Response res) {
			this.response.ok = false;
			this.response.status = Status.METHOD_NOT_ALLOWED;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		/**
         * 406 Not Acceptable, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.7">HTTP/1.1
         * documentation</a>.
         */
		public Object notAcceptable(Response res) {
			this.response.ok = false;
			this.response.status = Status.NOT_ACCEPTABLE;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 407 Proxy Authentication Required, see
         * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.8">HTTP/1.1 documentation</a>.
         *
         * @since 2.0
         */
		public Object proxyAuthenticationRequired(Response res) {
			this.response.ok = false;
			this.response.status = Status.PROXY_AUTHENTICATION_REQUIRED;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 408 Request Timeout, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.9">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object requestTimeout(Response res) {
			this.response.ok = false;
			this.response.status = Status.REQUEST_TIMEOUT;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 409 Conflict, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.10">HTTP/1.1
         * documentation</a>.
         */
		public Object conflict(Response res) {
			this.response.ok = false;
			this.response.status = Status.CONFLICT;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 410 Gone, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.11">HTTP/1.1 documentation</a>.
         */
		public Object gone(Response res) {
			this.response.ok = false;
			this.response.status = Status.GONE;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 411 Length Required, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.12">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object LengthRequired(Response res) {
			this.response.ok = false;
			this.response.status = Status.LENGTH_REQUIRED;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 412 Precondition Failed, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.13">HTTP/1.1
         * documentation</a>.
         */
		public Object preconditionFailed(Response res) {
			this.response.ok = false;
			this.response.status = Status.PRECONDITION_FAILED;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 413 Request Entity Too Large, see
         * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.14">HTTP/1.1 documentation</a>.
         *
         * @since 2.0
         */
		public Object requestEntityTooLarge(Response res) {
			this.response.ok = false;
			this.response.status = Status.REQUEST_ENTITY_TOO_LARGE;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 414 Request-URI Too Long, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.15">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object requestUriTooLong(Response res) {
			this.response.ok = false;
			this.response.status = Status.REQUEST_URI_TOO_LONG;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 415 Unsupported Media Type, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.16">HTTP/1.1
         * documentation</a>.
         */
		public Object unsupportedMediaType(Response res) {
			this.response.ok = false;
			this.response.status = Status.UNSUPPORTED_MEDIA_TYPE;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 416 Requested Range Not Satisfiable, see
         * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.17">HTTP/1.1 documentation</a>.
         *
         * @since 2.0
         */
		public Object requestedRangeNotSatisfiable(Response res) {
			this.response.ok = false;
			this.response.status = Status.REQUESTED_RANGE_NOT_SATISFIABLE;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 417 Expectation Failed, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.4.18">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object expectationFailed(Response res) {
			this.response.ok = false;
			this.response.status = Status.EXPECTATION_FAILED;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 428 Precondition required, see <a href="https://tools.ietf.org/html/rfc6585#section-3">RFC 6585: Additional HTTP
         * Status Codes</a>.
         *
         * @since 2.1
         */
		public Object preconditionRequired(Response res) {
			this.response.ok = false;
			this.response.status = Status.PRECONDITION_REQUIRED;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 429 Too Many Requests, see <a href="https://tools.ietf.org/html/rfc6585#section-4">RFC 6585: Additional HTTP Status
         * Codes</a>.
         *
         * @since 2.1
         */
		public Object tooManyRequests(Response res) {
			this.response.ok = false;
			this.response.status = Status.TOO_MANY_REQUESTS;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 431 Request Header Fields Too Large, see <a href="https://tools.ietf.org/html/rfc6585#section-5">RFC 6585: Additional
         * HTTP Status Codes</a>.
         *
         * @since 2.1
         */
		public Object requestHeaderFieldsTooLarge(Response res) {
			this.response.ok = false;
			this.response.status = Status.REQUEST_HEADER_FIELDS_TOO_LARGE;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 451 Unavailable For Legal Reasons, see <a href="https://tools.ietf.org/html/rfc7725">RFC 7725:
         * An HTTP Status Code to Report Legal Obstacles</a>.
         *
         * @since 3.1
         */
		public Object unavailableForLegalReasons(Response res) {
			this.response.ok = false;
			this.response.status = Status.UNAVAILABLE_FOR_LEGAL_REASONS;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 500 Internal Server Error, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.5.1">HTTP/1.1
         * documentation</a>.
         */
		public Object internalServerError(Response res) {
			this.response.ok = false;
			this.response.status = Status.INTERNAL_SERVER_ERROR;
				
			res.status(response.status.getStatusCode());

			return response;
		}
		
		public Object internalServerError(Response res, ErrorType type, String message) {
			this.response.ok = false;
			this.response.status = Status.INTERNAL_SERVER_ERROR;
			this.response.data[0] = new ErrorData(type, message);
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
        /**
         * 501 Not Implemented, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.5.2">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object notImplemented(Response res) {
			this.response.ok = false;
			this.response.status = Status.NOT_IMPLEMENTED;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 502 Bad Gateway, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.5.3">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object badGateway(Response res) {
			this.response.ok = false;
			this.response.status = Status.BAD_GATEWAY;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 503 Service Unavailable, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.5.4">HTTP/1.1
         * documentation</a>.
         */
		public Object serviceUnavailable(Response res) {
			this.response.ok = false;
			this.response.status = Status.SERVICE_UNAVAILABLE;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 504 Gateway Timeout, see <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.5.5">HTTP/1.1
         * documentation</a>.
         *
         * @since 2.0
         */
		public Object gatewayTimeout(Response res) {
			this.response.ok = false;
			this.response.status = Status.GATEWAY_TIMEOUT;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 505 HTTP Version Not Supported, see
         * <a href="http://www.w3.org/Protocols/rfc2616/rfc2616-sec10.html#sec10.5.6">HTTP/1.1 documentation</a>.
         *
         * @since 2.0
         */
		public Object httpVersionNotSupported(Response res) {
			this.response.ok = false;
			this.response.status = Status.HTTP_VERSION_NOT_SUPPORTED;
			
			res.status(response.status.getStatusCode());

			return response;
		}

        /**
         * 511 Network Authentication Required, see <a href="https://tools.ietf.org/html/rfc6585#section-6">RFC 6585: Additional
         * HTTP Status Codes</a>.
         *
         * @since 2.1
         */
		public Object networkAuthenticationRequired(Response res) {

			this.response.ok = false;
			this.response.status = Status.NETWORK_AUTHENTICATION_REQUIRED;
			
			res.status(response.status.getStatusCode());

			return response;
		}
		
	}