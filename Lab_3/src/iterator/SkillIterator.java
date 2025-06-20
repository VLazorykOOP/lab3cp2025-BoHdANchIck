package iterator;

import model.Skill;

import java.util.List;

public class SkillIterator implements Iterator<Skill> {
    private final List<Skill> skills;
    private int position = 0;

    public SkillIterator(List<Skill> skills) {
        this.skills = skills;
    }

    @Override
    public boolean hasNext() {
        return position < skills.size();
    }

    @Override
    public Skill next() {
        return skills.get(position++);
    }
}
