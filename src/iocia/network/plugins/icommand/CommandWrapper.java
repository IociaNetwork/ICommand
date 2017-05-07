package iocia.network.plugins.icommand;

import org.bukkit.command.TabExecutor;
import org.bukkit.permissions.Permission;

import java.util.ArrayList;
import java.util.List;

public abstract class CommandWrapper implements TabExecutor {

    protected String displayName;
    protected String commandName;
    protected String description;
    protected String usage;
    protected List<String> aliases;
    protected List<Permission> permissions;

    public CommandWrapper() {
        aliases = new ArrayList<>();
        permissions = new ArrayList<>();
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public void addAlias(String alias) {
        aliases.add(alias);
    }

    public void addPerm(Permission permission) {
        permissions.add(permission);
    }

}
