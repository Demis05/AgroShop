package com.ws.agro_shop.util;


/**
 * Common error messages for services
 */
public final class ErrorMessages {


    public static final String MANAGER_SHOULD_NOT_BE_ONE_OF_ALLOWED_ACCESS_USERS =
            "Manager's ID should not be used in allowedAccessUserIds response part";

    public static final String TEST_CANNOT_BE_DELETED_USED_IN_TEST_EVENT = "Test cannot be deleted due to a fact that it is used in test event";

    public static final String TEST_CANNOT_BE_DELETED_DOES_NOT_HAVE_PERMISSIONS = "Test cannot be deleted due "
            + "to a fact that user does not have permissions";

    public static final String CAN_NOT_REASSIGN_TEST_SESSION = "Unable to reassign test session when status is %s";

    public static final String CAN_NOT_FIND_LOCATION = "Can not find location";

    public static final String TOPIC_WITH_SUCH_NAME_EXISTS = "Topic with such name exists";

    public static final String THE_USER_DOES_NOT_HAVE_CREATOR_OR_ADMINISTRATOR_RIGHTS = "The user does not have the creator or administrator rights.";

    public static final String THE_USER_DOES_NOT_HAVE_TEST_MANAGER_OR_ADMINISTRATOR_RIGHTS =
            "The user does not have the test manager or administrator rights.";

    public static final String INACTIVE_USER = "The user is inactive";

    public static final String GROUP_DO_NOT_EXIST = "Searched group do not exist";

    public static final String CAN_NOT_DELETE_GROUP_ASSIGNED_TESTS_EXIST = "The group could not be deleted as it contains Test(s) assigned.";

    public static final String ACCESS_DENIED_YOU_CAN_NOT_DELETE_COMMENT = "Access denied. You are not allowed to delete not your comment";
    public static final String CAN_NOT_DELETE_GROUP_NOT_REVIEWED_TESTS_EXIST =
            "The group could not be deleted as it contains not checked Test Result(s).";

    public static final String TEST_SESSION_DO_NOT_EXIST = "Test session does not exist";

    public static final String TEST_SESSION_CHECKING_LOG_DO_NOT_EXIST = "Test session checking log does not exist";

    public static final String REQUESTED_TEST_SESSION_STARTED = "Requested test session started";

    public static final String USER_DOES_NOT_EXIST = "User does not exist";

    public static final String USER_ALREADY_EXISTS = "User already exists";

    public static final String SECURITY_BREACH = "Security breach";

    public static final String CAN_NOT_FIND_TEST_SESSION_QUESTION = "Can not find test session question";

    public static final String CAN_NOT_FIND_TEST_SESSION_COMMENT = "Can not find test session comment";

    public static final String CAN_NOT_FIND_ANSWER = "Can not find answer";

    public static final String TEST_SESSION_IS_NOT_IN_STATUS_IN_PROGRESS = "The test session isn't in status IN_PROGRESS";

    public static final String CAN_NOT_SET_MARK_TO_TEST_SESSION_QUESTION = "The question mark could not be set if Test was not passed";

    public static final String QUESTION_WAS_BANNED = "The question was banned.";

    public static final String QUESTION_IS_CHECKING_IN_MOMENT = "The question is being checked by %s in this moment.";

    public static final String QUESTION_TYPE_HAS_NOT_FULL_ANSWER = "This type hasn't full answer.";

    public static final String QUESTION_TYPE_HAS_NOT_VARIANT_ANSWERS = "This type hasn't variants of answers.";

    public static final String QUESTION_TYPE_HAS_ONE_VARIANT_ANSWER = "This type has to have only one variant answer.";

    public static final String CAN_NOT_START_TEST_SESSION_BEFORE_START_DATE = "Can not start test session before start date. Start date: %s";

    public static final String CAN_NOT_START_TEST_SESSION_AFTER_DEADLINE = "Can not start test session after deadline. Deadline: %s";

    public static final String CAN_NOT_START_TEST_SESSION_USER_NOT_ASSIGNED = "Can not start test session, because you do not assigned for that test";

    public static final String EMPLOYEE_WITH_SPECIFIED_UPSA_ID_DOES_NOT_EXIST = "Employee with specified upsa id does not exist";

    public static final String USER_NOT_FOUND = "The user could not be found for authorization.";

    public static final String ILLEGAL_TEST_SESSION_STATUS = "Illegal test session status.";

    public static final String ACCESS_TO_SESSION_RESULTS_DENIED = "You can not to check the results.";

    public static final String QUESTION_ALREADY_IN_THE_TEST = "The question cannot be modified, it's already used in the test";

    public static final String WRONG_QUESTION_ID = "Wrong question entity id.";

    public static final String QUESTION_NAME_EXISTS = "Question in this topic with such name exists";

    public static final String CAN_NOT_FIND_TOPIC = "Can not find topic";

    public static final String CAN_NOT_FIND_TOPIC_WITH_QUESTIONS = "Can not find topic with questions";

    public static final String CAN_NOT_FIND_QUESTION = "Can not find question";

    public static final String WRONG_ANSWER_ID = "Wrong answer entity id.";

    public static final String NO_CORRECT_ANSWER_FOR_QUESTION = "At least one answer should be marked as correct";

    public static final String ALLERT_TEST_SESSION_IS_CHECKING_BY_CHECKERS =
            "Be aware that %s is checking the test at the moment. Are you sure you want to continue reviewing?";

    public static final String USER_IS_NOT_ALLOWED_TO_CHECK_THIS_TEST = "You are not allowed to check this test.";

    public static final String INCORRECT_TEST_EVENT_ID = "Incorrect test event id.";

    public static final String INCORRECT_START_DATE =
            "Incorrect start date." + " Choose a correct date lower than deadline and greater than now plus 5 minutes";

    public static final String INCORRECT_DEADLINE_DATE =
            "Incorrect deadline date." + " Choose a correct date greater than start date at least for 1 hour";

    public static final String INCORRECT_CHECKING_DEADLINE_DATE =
            "Incorrect checking deadline date." + " Choose a correct date greater than deadline at least for 1 day";

    public static final String INCORRECT_TEST_DURATION = "Incorrect test duration. " + "It should be lower than 120 min., and greater than 1 minute";

    public static final String DURATION_IS_OUTSIDE_OF_START_DATE_AND_DEADLINE_BOUNDARIES =
            "Duration is outside of start date and deadline boundaries";

    public static final String INCORRECT_FIELD_WARN = "Incorrect %s : %s";

    public static final String TEST_WITH_SPECIFIED_ID_DOES_NOT_EXIST = "Test with specified id does not exist";

    public static final String GROUP_WITH_SPECIFIED_ID_DOES_NOT_EXIST = "Group with specified id does not exist";

    public static final String GROUP_WITH_SPECIFIED_ID_ALREADY_EXISTS = "Group with specified id %s already exists";

    public static final String GROUP_WITH_SPECIFIED_NAME_ALREADY_EXISTS = "Group with name %s already exists";

    public static final String USER_WITH_SPECIFIED_ID_DOES_NOT_EXIST = "User with specified id does not exist";

    public static final String TEST_EVENT_CAN_NOT_BE_CHANGED_WHILE_IT_IS_NOT_ASSIGNED = "Test Event can not be changed while it is not assigned.";

    public static final String START_DATE_CAN_NOT_BE_CHANGED_WHEN_TEST_IS_IN_PROGRESS = "Start date can not be changed when test is in progress.";

    public static final String DURATION_CAN_NOT_BE_CHANGED_WHEN_TEST_IS_IN_PROGRESS = "Duration can not be changed when test is in progress.";

    public static final String THE_ONLY_START_DATE_DURATION_AND_DEADLINE_COULD_BE_CHANGED =
            "Only start date, duration and deadline could be changed.";

    public static final String TEST_EVENT_CAN_NOT_BE_CHANGED_WHILE_IT_IS_NOT_ASSIGNED_OR_IN_PROGRESS_STATUS =
            "Test Event can not be changed while it is not assigned or in progress status.";

    public static final String YOU_TRIED_TO_EDIT_UNSUPPORTED_FIELDS = "You tried to edit unsupported fields";

    public static final String UNABLE_TO_EDIT_EVENT_IN_ITS_CURRENT_STATUS = "Editing test event in such status is restricted";

    public static final String UNABLE_TO_EDIT_REQUESTED_FIELDS_WHILE_IN_PROGRESS = "Only deadlines and checkers can be updated while in progress";

    public static final String UNABLE_TO_CHANGE_TESTEES_WHILE_IN_PROGRESS = "Unable to change testees while in progress";

    public static final String UPDATE_OF_PROVIDED_FIELDS_IS_PROHIBITED =
            "Test, group, warnings number, ban questions and results type cannot be changed";

    public static final String TESTEES_ARE_NOT_FROM_THE_SAME_GROUP = "Testees are not from the same group";

    public static final String SPECIFIED_TESTEES_ARE_NOT_FROM_THE_REQUIRED_GROUP = "Specified testees are not from the same group";

    public static final String TESTEE_LIST_CANNOT_BE_EMPTY = "Testees list cannot be empty";

    public static final String CHECKER_LIST_CANNOT_BE_EMPTY = "Checkers list cannot be empty";

    public static final String INCORRECT_ENTITY_ID = "Incorrect %s id";

    public static final String INCORRECT_ENTITY_TYPE = "Incorrect entity type";

    public static final String CAN_NOT_PERFORM_OPERATION_WITH_ENTITY_WHICH_HAS_ID = "Can not perform operation with %s entity which has id %s";

    public static final String CAN_NOT_FIND_USER = "Can not find the user";

    public static final String QUESTION_ID_USER_TRIES_TO_MODIFY = "Question id user tries to modify is %s";

    public static final String DUPLICATE_ANSWER_TEXT_IN_QUESTION = "Duplicate answer text in question";

    public static final String SINGLE_TYPE_CORRECT_LIM = "Type ‘SINGLE’ must have at least 2 answers (up to 25), where only one must be correct";

    public static final String DUPLICATE_USER_NAME = "Duplicate user name(%d occurrences)";

    public static final String USER_HAS_JUST_STARTED_TO_EDIT_TOPIC = "User {} has just started to edit topic {}";

    public static final String USER_HAS_JUST_TRIED_TO_START_EDIT_TOPIC = "User {} has just tried to start edit topic {}";

    public static final String USER_HAS_JUST_TRIED_TO_START_EDIT_ACCESS_OF_TOPIC = "User {} has just tried to start edit the access of the topic {}";

    public static final String NOT_ALLOWED_TYPE_OF_TEST = "Only tests in status NOT PASSED are allowed to reassign.";

    public static final String REASSIGN_TEST_REQUEST_ALREADY_IN_PROCESS = "Reassign test request is already in process";

    public static final String CHECKER_WRONG_TEST_SESSION_ID = "There is no test for you to check";

    public static final String TEST_SESSION_QUESTION_DOES_NOT_EXIST = "There is no test session question";

    public static final String FAILED_TO_BAN_QUESTION_TEST_SESSION_NOT_IN_PROGRESS = "Failed to ban question. Test session is not in progress";

    public static final String FAILED_TO_BAN_QUESTION_TEST_EVENT_DOES_NOT_ALLOW =
            "Failed to ban question. " + "Current test event does not have possibility to ban questions";

    public static final String EMAIL_NOTIFICATION_OF_USER_REGISTRATION_NOT_SEND = "Notification of user registration with {} rights not sent";

    public static final String EMAIL_NOTIFICATION_OF_CHANGES_TIME_PARAMETERS_NOT_SEND =
            "Notification about any changes of Start/Duration/Deadline of the tests not sent";

    public static final String COMMENT_NOT_FOUND = "Comment to this session with such id is not found";

    public static final String CANNOT_UPDATE_COMMENT_OF_ANOTHER_USER = "Cannot update comment of another user: %s";

    public static final String TEST_MANAGER_IS_NOT_AUTHOR_OF_TOPIC = "Test manager is not the author of the topic";

    public static final String TOPIC_WITH_ANSWERS_CANNOT_BE_DELETED = "The topic cannot be deleted because it has assigned questions";

    public static final String TEST_SESSION_WITH_SPECIFIED_ID_DOES_NOT_EXIST = "Test session with specified id does not exist";

    public static final String TEST_MANAGER_CANNOT_CREATE_ADMIN = "Test manager cannot create admin";

    public static final String TESTEE_CANNOT_BE_CHECKER = "Testee cannot be checker";

    public static final String DELETED_USERS_CANNOT_BE_ADDED_TO_TEST = "Deleted users cannot be added to test:";

    public static final String COMMENT_FOR_TEST_SESSION_QUESTION_NOT_FOUND = "Comment to the test session question with such id not found";

    public static final String REGEXP_TYPE_CORRECT_ANSWER = "Question with type ‘REGEXP’ must have 1 answer and no more strictly";

    private static final String CLASS_SHOULD_NOT_BE_INSTANTIATED = "Class should not be instantiated";

    public static final String WRONG_NUMBER_OF_ANSWER_CHOICES_FOR_SINGLE_TYPE_QUESTION =
            "The number of answer choices for single type question must be greater than 1 and less than 26";

    public static final String WRONG_NUMBER_OF_ANSWER_CHOICES_FOR_SEVERAL_TYPE_QUESTION =
            "The number of answer choices for several type question must be greater than %d and less than %d";

    public static final String TEST_EVENT_DOES_NOT_EXISTS = "Test event does not exists";

    public static final String REQUESTED_TEST_EVENT_STARTED = "Requested test event started";

    public static final String ACCESS_DENIED_TO_CHANGE_ROLE = "Access denied. You are not allowed to change admin role";

    public static final String CHECKERS_ARE_CHECKING_THE_TEST_NOW = "Checkers %s are checking the test now";

    public static final String INCORRECT_CHECKER_IDS = "Incorrect checker ids";

    public static final String USER_HAS_TRIED_TO_VIEW_TOPIC = "User {} has tried to view topic {}";

    public static final String THE_USER_DOES_NOT_HAVE_PERMISSION_TO_VIEW_THE_TOPIC =
            "The user does not have permission to view the topic.";

    public static final String ACCESS_DENIED_TO_WORK_WITH_GROUP = "Access is denied. The user {} does not have access (EDIT|MANAGE_TEST)";

    public static final String ACCESS_ALLOWED_TO_WORK_WITH_GROUP = "Access is allowed. The user {} has access";

    public static final String INCORRECT_TEST_ID = "Incorrect test id";

    public static final String INCORRECT_QUESTION_ID = "Incorrect question id";

    public static final String EXTERNAL_USER_MUST_HAVE_USER_ROLE = "An external user must have EXTERNAL_USER role";

    public static final String THE_USER_DOES_NOT_HAVE_CREATOR_RIGHTS =
            "The user does not have the creator rights.";
    public static final String ACCESS_DENIED_YOU_CAN_NOT_EXPORT_THIS_GROUP = "Access denied. You are not allowed to export this group";
    public static final String ASSIGNED_TESTS_IS_EMPTY_FOR_THIS_GROUP = "Assigned tests is empty for this group";
    public static final String TEST_MANAGER_IS_NOT_AUTHOR_OF_TEST = "Test manager is not the author of the test";
    public static final String CAN_NOT_FIND_TEST_WITH_QUESTIONS = "Can not find test with questions";

    private ErrorMessages() {
        throw new UnsupportedOperationException(CLASS_SHOULD_NOT_BE_INSTANTIATED);
    }
}
