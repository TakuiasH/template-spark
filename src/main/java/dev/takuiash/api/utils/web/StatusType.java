package dev.takuiash.api.utils.web;
/**
     * Base interface for statuses used in responses.
     *
     * @since 1.1
     */
    public interface StatusType {

        /**
         * Get the associated status code.
         *
         * @return the status code.
         */
        public int getStatusCode();

        /**
         * Get the class of status code.
         *
         * @return the class of status code.
         */
        public Status.Family getFamily();

        /**
         * Get the reason phrase.
         *
         * @return the reason phrase.
         */
        public String getReasonPhrase();

        /**
         * Get the this Status Type as a {@link Status}.
         * <p>
         * Please note that returned status contains only a status code, the reason phrase is set to default one (corresponding
         * to the status code).
         *
         * @return {@link Status} representing this status type.
         * @since 2.1
         */
        public default Status toEnum() {
            return Status.fromStatusCode(getStatusCode());
        }
    }

    