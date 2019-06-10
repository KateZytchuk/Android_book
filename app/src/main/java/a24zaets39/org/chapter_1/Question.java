package a24zaets39.org.chapter_1;

/*Model level GeoQuiz*/

public class Question
{
    private  int mResTextId; // идентификатор строкового ресурса с текстом вопроса
    private boolean mAnswerTrue;

    public Question(int ResTextId, boolean AnswerTrue)
    {
        mResTextId = ResTextId;
        mAnswerTrue = AnswerTrue;
    }

    public int getResTextId()
    {
        return mResTextId;
    }

    public void setResTextId(int resTextId)
    {
        mResTextId = resTextId;
    }

    public boolean isAnswerTrue()
    {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue)
    {
        mAnswerTrue = answerTrue;
    }
}
