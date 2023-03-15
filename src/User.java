public class User
{
    private int rank;
    private int progress;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public User()
    {
        rank = -8;
        progress = 0;
    }

    public void incProgress(int x)
    {
        if(rank == 8)
        {
            return;
        }
        if((x > 8) || (x < -8) || (x == 0))
        {
            throw new IllegalArgumentException("The rank of an activity cannot be less than 8, 0, or greater than 8!");
        }
        if(x == rank)
        {
            progress = progress + 3;
        }
        else if(x == rank - 1)
        {
            progress = progress + 1;
        }
        else if(x <= rank - 2)
        {
            progress = progress;
        }
        else
        {
            int gap = x - rank;
            progress = progress + (gap * gap* 10);
        }

        if(progress >= 100)
        {
            if(rank == -1)
            {
                rank = 1;
                progress = progress - 100;
            }
            else
            {
                rank = rank+1;
                progress = progress - 100;
            }
        }

    }

    @Override
    public String toString() {
        return "User{" +
                "rank=" + rank +
                ", progress=" + progress +
                '}';
    }
}
